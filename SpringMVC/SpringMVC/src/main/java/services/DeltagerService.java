package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import interfaces.DeltagerRepo;
import objects.Deltager;

@Service
public class DeltagerService {
    
	@Autowired private DeltagerRepo deltagerrepo;

	public List<Deltager> findAllDeltager() {
        return deltagerrepo.findAll();
    }

    public Deltager finnDeltagerByFornavn(String navn) {
        return deltagerrepo.findByFornavn(navn); // Use the method from the interface
    }
}
