public abstract class EngineVehicle extends NonEngineVehicle {

    public EngineVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        this.checkEngine();
    }
}