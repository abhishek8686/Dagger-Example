package com.example.myapplication.module;

import com.example.myapplication.model.Motor;
import com.example.myapplication.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module()
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
