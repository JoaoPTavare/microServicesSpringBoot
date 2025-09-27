package ms_work.controller;

import ms_work.entites.Worker;
import ms_work.respository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RestController
public class WorkerController {

    @Autowired
    private WorkRepository workRepository;




}
