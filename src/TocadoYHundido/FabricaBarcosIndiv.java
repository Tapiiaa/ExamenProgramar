package TocadoYHundido;

public class FabricaBarcosIndiv implements FabricaBarcos{
    public Barco crearBattleShip(){
        return new Battleship();
    }

    public Barco crearFrigate(){
        return new Frigate();
    }

    public Barco crearCanoe(){
        return new Canoe();
    }
}
