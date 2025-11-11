package ms_work.service;

import ms_work.entites.Worker;
import ms_work.respository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface WorkerService {

    public Worker creatWorkerEndereco(Worker worker);
}
