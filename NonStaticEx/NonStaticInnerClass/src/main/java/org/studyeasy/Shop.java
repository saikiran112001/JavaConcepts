package org.studyeasy;

public class Shop {
    Lock lock=new Lock();

    public void ShopStatus(){
        if(lock.isLocking()){
            System.out.println("shop is closed");
        }else{
            System.out.println("shop is open");
        }
    }

    public Lock getLock() {
        return lock;
    }

    public class Lock{
        private boolean locking =true;

        public boolean isLocking() {
            return locking;
        }

        public void setLocking(boolean locking) {
            this.locking = locking;
        }
    }
}
