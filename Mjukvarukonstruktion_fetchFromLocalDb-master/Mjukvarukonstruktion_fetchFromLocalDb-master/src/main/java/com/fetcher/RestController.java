package com.fetcher;


import data.MyDatabase;
import model.JournalRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/*This is the controller that the JPA uses. @Controller makes this possible.
@Autowired is used to get the repository-beans, we will use it to handle the data.
The repositories inherits methods for CRUD-operations.
@CrossOrigin lets the React-App(from the specified IP-Address) connect to the server.
@Requestmapping tells what the URL starts with.*/

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(method = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
public class RestController {

 /*   @GetMapping(path="/testPath")
    public @ResponseBody String addRecord (@RequestParam String category, @RequestParam String content) {
        String date = LocalDate.now().toString();
        JournalRecord jr = new JournalRecord(category, content, date);
        MyDatabase.getinstance().saveToDB(jr);
        return "added record";
    }*/

    @PostMapping(path="/testPath")
    public @ResponseBody String addRecord (@RequestParam String category, @RequestParam String content) {
        String date = LocalDate.now().toString();
        JournalRecord jr = new JournalRecord(category, content, date);
        MyDatabase.getinstance().saveToDB(jr);
        return "added record";
    }

    @PostMapping(path="/test")
    public @ResponseBody String addRe (@RequestParam String category, @RequestParam String content) {
        String date = LocalDate.now().toString();
        JournalRecord jr = new JournalRecord(category, content, date);
        MyDatabase.getinstance().saveToDB(jr);
        return "added record";
    }

    @GetMapping(path="/getRecordById")
    public @ResponseBody JournalRecord getJr (@RequestParam int id) {
        JournalRecord jr = MyDatabase.getinstance().getJournalRecordById(id);
        return jr;
    }

    @GetMapping(path="/getAllRecords")
    public @ResponseBody
    List<JournalRecord> getAllJr () {
        return MyDatabase.getinstance().getAllJournalRecords();
    }
}