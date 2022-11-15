package design_pattern.Interpreter;

public class ObjectNode extends Node {

    @Override
    public Object parse(Context context) throws JsonParseException {
        
        Class<Employee> employeeClass = Employee.class;
        Object employee = null;

        try {
            employee = employeeClass.newInstance();

            while(context.hasMoreTokens()) {
                context.nextToken();

                Node kyeValueNode = new KeyValueNode(employee, employeeClass);
                kyeValueNode.parse(context);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new JsonParseException(e.getLocalizedMessage());
        }

        return employee;
    }
    
}
