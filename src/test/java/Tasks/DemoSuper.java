package Tasks;

public class DemoSuper {

		    void start() {
		        System.out.println("Machine starting...");
		    }


		class Robot extends DemoSuper {
		    @Override
			void start() {
		        super.start(); // calls Machine's start()
		        System.out.println("Robot powered on.");
		    }
		}

	}


