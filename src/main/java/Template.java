import java.util.HashMap;
import java.util.Map;
import static java.util.Map.Entry;

/**
 * This program demonstrates console input.
 *
 * @author sally
 * @version 1.10 2020-03-2822:12
 */
public class Template {

    private String variableVaule;
    private String templateText;
    private Map<String, String> variables;

    public Template(String templateText) {
        this.variables = new HashMap<String, String>();
        this.templateText = templateText;
    }

    public void set(String variable, String value) {
       this.variables.put(variable, value);
    }

    public String evaluate()
    {
        String result = templateText;
        for (Entry<String, String> entry : variables.entrySet()) {
            String regex = "${" + entry.getKey() + "}";
            result = result.replace(regex, entry.getValue());
        }
        return result;
    }
}
