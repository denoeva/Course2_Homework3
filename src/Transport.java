public abstract class Transport implements Serviceable {
    protected final String modelName;
    protected final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку, транспорт: " + getModelName());
    }

    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}




