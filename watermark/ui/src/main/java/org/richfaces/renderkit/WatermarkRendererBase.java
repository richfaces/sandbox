package org.richfaces.renderkit;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.convert.Converter;

import org.ajax4jsf.javascript.JSObject;
import org.richfaces.component.AbstractWatermark;
import org.richfaces.component.util.InputUtils;

@ResourceDependencies({
    @ResourceDependency(name = "jquery.js", target = "head"),
    @ResourceDependency(name = "jquery.watermark.js", target = "head"),
    @ResourceDependency(name = "base-component.reslib", library = "org.richfaces", target = "head"),
    @ResourceDependency(name = "richfaces.watermark.js", target = "head")
})
public abstract class WatermarkRendererBase extends InputRendererBase {
// ------------------------------ FIELDS ------------------------------

    /**
     * Following defaults are be used by addOptionIfSetAndNotDefault
     */
    public static final Map<String, Object> DEFAULTS;

    public static final String RENDERER_TYPE = "org.richfaces.WatermarkRenderer";

// -------------------------- STATIC METHODS --------------------------

    static {
        Map<String, Object> defaults = new HashMap<String, Object>();
        defaults.put("styleClass", "");
        defaults.put("useNative", true);
        DEFAULTS = Collections.unmodifiableMap(defaults);
    }

    protected void addOptionIfSetAndNotDefault(String optionName, Object value, Map<String, Object> options) {
        if (value != null && !"".equals(value) && !value.equals(DEFAULTS.get(optionName))) {
            options.put(optionName, value);
        }
    }

    protected Map<String, Object> getOptions(FacesContext facesContext, AbstractWatermark watermark) {
        /**
         * Include only attributes that are actually set.
         */
        Map<String, Object> options = new HashMap<String, Object>();
        addOptionIfSetAndNotDefault("styleClass", watermark.getAttributes().get("styleClass"), options);
        addOptionIfSetAndNotDefault("text", getConvertedValue(facesContext, watermark), options);
        return options;
    }

    private String getConvertedValue(FacesContext facesContext, AbstractWatermark watermark) {
        final Object value = watermark.getValue();

        Converter converter = InputUtils.findConverter(facesContext, watermark, "value");

        if (converter != null) {
            return converter.getAsString(facesContext, watermark, value);
        } else {
            return value != null ? value.toString() : "";
        }
    }

    protected void writeInitFunction(FacesContext context, UIComponent component) throws IOException {
        AbstractWatermark watermark = (AbstractWatermark) component;
        ResponseWriter writer = context.getResponseWriter();
        String clientId = watermark.getClientId(context);
        final Map<String, Object> options = getOptions(context, watermark);
        options.put("targetId", watermark.getTargetClientId(context));
        writer.writeText(new JSObject("RichFaces.ui.Watermark", clientId, options).toScript(), null);
    }
}

