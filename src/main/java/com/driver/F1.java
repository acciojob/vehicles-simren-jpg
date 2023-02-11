package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super("mercedes",4,2,5,isManual,"petrol",4);

        //Use arbitrary values for parameters which are not mentione
        }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        newSpeed = getCurrentSpeed()+rate;
        if(newSpeed == 0) {
            stop();
            setCurrentGear(1);

            //Stop the car, set gear as 1
        }
        else if(newSpeed>=1 && newSpeed <=50) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(1);

            //Stop the car, set gear as 1
        }else if(newSpeed>=51 && newSpeed<=100) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(2);


            //Stop the car, set gear as 1
        }else if(newSpeed>=101 && newSpeed<=150) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(3);

            //Stop the car, set gear as 1
        }else if(newSpeed>=151 && newSpeed<=200) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(4);


            //Stop the car, set gear as 1
        }else if(newSpeed>=201 && newSpeed<=250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(5);
        }else if(newSpeed > 250){
            setCurrentSpeed(newSpeed);
            setCurrentGear(6);
        }
        if(newSpeed >0){
            changeSpeed(newSpeed,getCurrentDirection());
        }
            //Stop the car, set gear as 1
              //for all other cases, change the gear accordingl
    }
}
