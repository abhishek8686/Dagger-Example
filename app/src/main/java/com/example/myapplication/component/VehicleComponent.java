package com.example.myapplication.component;

import com.example.myapplication.MainActivity;
import com.example.myapplication.model.Vehicle;
import com.example.myapplication.module.VehicleModule;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
    void inject(MainActivity mainActivity);

}
