package app.patterns.abstractfactory.metal;

import org.springframework.stereotype.Service;

import app.patterns.abstractfactory.Door;
import app.patterns.abstractfactory.HousePartsFactory;
import app.patterns.abstractfactory.Window;

@Service
public class MetalHousePartsFactory implements HousePartsFactory {
    @Override
    public Door makeDoor() {
        return new MetalDoor();
    }

    @Override
    public Window makeWindow() {
        return new MetalWindow();
    }
}
