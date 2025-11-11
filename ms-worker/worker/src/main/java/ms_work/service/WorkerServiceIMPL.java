package ms_work.service;

import ms_work.entites.Worker;
import ms_work.respository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerServiceIMPL implements WorkerService{

    @Autowired
    private WorkerRepository workerRepository;


    @Override
    public Worker creatWorkerEndereco(Worker worker) {
       try{
        Worker auxWorker = new Worker();

        return  auxWorker;}
       catch (Exception e){
           return null;
       }
    }
}
