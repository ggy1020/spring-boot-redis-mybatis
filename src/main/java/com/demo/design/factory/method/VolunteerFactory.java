package com.demo.design.factory.method;

public class VolunteerFactory  implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
