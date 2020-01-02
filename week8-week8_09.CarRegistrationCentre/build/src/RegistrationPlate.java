
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
 
    public String getRegCode() {
        return this.regCode;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        
        if (this.getClass() != object.getClass()) {
            return false;
        }
        
        RegistrationPlate compared = (RegistrationPlate) object;
        
        if (compared.getRegCode() == null || !this.getRegCode().equals(compared.getRegCode())) {
            return false;
        }
        
        if (compared.getCountry() == null || !this.getCountry().equals(compared.getCountry())) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.getCountry() == null || this.getRegCode() == null) {
            return 13;
        }
        return this.getCountry().hashCode() + this.getRegCode().hashCode();
    }
}