public abstract class TransportWithEngine extends Transport {
    public TransportWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель, транспорт: " + getModelName());
    }

    public void service() {
        super.service();
    }
}
