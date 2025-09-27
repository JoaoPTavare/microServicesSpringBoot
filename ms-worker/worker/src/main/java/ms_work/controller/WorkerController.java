package ms_work.controller;

import ms_work.entites.Worker;
import ms_work.respository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/workes")
public class WorkerController {

    @Autowired
    private WorkRepository workRepository;

    //Get

    @GetMapping(value = "/findWorker")
    public ResponseEntity<List<Worker>> findAll() {
        try {
            List<Worker> listWoker = workRepository.findAll();
            return ResponseEntity.ok(listWoker);
        } catch (Exception e) {
            ResponseEntity.ok("Not found even of a worker");
        }
        return null;
    }

    @GetMapping( value = "Worker/{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id){
        try {
        Optional<Worker> worker = Optional.of(workRepository.findById(id).get());
        return ResponseEntity.ok(worker);
        }catch(Exception e){

        }
        return null;
    }

    //Put

    //Dek=lete
    @DeleteMapping("woker/{id}")
    public ResponseEntity<String> deletById(@PathVariable Long id){
        try {
            workRepository.deleteById(id);
            return ResponseEntity.ok("The worker is successfully removed");
        }catch (Exception e){
            return ResponseEntity.ok("It was not possible to remove the worker");
        }
    }
}
