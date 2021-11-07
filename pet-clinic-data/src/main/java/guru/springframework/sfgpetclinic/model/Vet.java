package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{

    private Set<Speciality> getSpecialities;

    public Set<Speciality> getGetSpecialities() {
        return getSpecialities;
    }

    public void setGetSpecialities(Set<Speciality> getSpecialities) {
        this.getSpecialities = getSpecialities;
    }
}

