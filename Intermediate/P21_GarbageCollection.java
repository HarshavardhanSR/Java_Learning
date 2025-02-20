public class P21_GarbageCollection {
    static class DemoObject {
        private String name;

        DemoObject(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println(name + " is being garbage collected");
        }
    }

    public static void main(String[] args) {
        // Creating objects
        DemoObject obj1 = new DemoObject("Object 1");
        DemoObject obj2 = new DemoObject("Object 2");
        DemoObject obj3 = new DemoObject("Object 3");

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;
        obj3 = null;

        // Requesting JVM to run GC
        System.gc();

        // Adding delay to allow GC to process
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program");
    }
}
