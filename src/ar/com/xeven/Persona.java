package ar.com.xeven;

public class Persona {
    public int dni;

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass().getSimpleName().equals("Persona")){
            Persona newP = (Persona) obj;
            return newP.dni == this.dni;
        }else{
            return false;
        }
    }
}
