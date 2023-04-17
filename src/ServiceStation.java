public class ServiceStation {
    public void check(Serviceable serviceable) {
        serviceable.service();
    }

    public void checkAll(Serviceable[] serviceables) {
        for (Serviceable serviceable : serviceables) {
            serviceable.service();
        }
    }
}
