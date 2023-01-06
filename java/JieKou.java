public class JieKou {
    public static void main(String[] args){
        Flyer f;
        f=new Airplane();
        f.fly();
        f=new Bird();
        f.land();
    }}
    interface Flyer{
        public abstract void takeoff();
        void land();
        void fly();
    }
    class Airplane implements Flyer{
        public void takeoff(){}
        public void land(){}
        public void fly(){}
    }
    class Bird implements Flyer{
        public void takeoff(){}
        public void land(){}
        public void fly(){}
        public void birdNest(){}
        public void layEggs(){}
    }
    class Suoerman implements Flyer{
        public void takeoff(){}
        public void land(){}
        public void fly(){}
        public void leadbuilding(){}
        public void stgopBullet(){}
    }

