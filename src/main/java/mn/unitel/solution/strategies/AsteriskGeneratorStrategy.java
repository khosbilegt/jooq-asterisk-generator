package mn.unitel.solution.strategies;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;
import org.jooq.meta.EnumDefinition;

public class AsteriskGeneratorStrategy extends DefaultGeneratorStrategy {
    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if (definition instanceof EnumDefinition enumDefinition) {
            if(enumDefinition.getName().equals("yesno_values")) {
                return "YesNoValues1";
            } else if(enumDefinition.getName().equals("yes_no_values")) {
                return "YesNoValues2";
            }
        }
        return super.getJavaClassName(definition, mode);
    }
}
