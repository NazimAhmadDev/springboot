package com.springDemo.Journal.App;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean creatingEntry(@RequestBody List<JournalEntry> myEntry) {
        //journalEntries.put(myEntry.getId(), myEntry);

        for(JournalEntry entries : myEntry) {
            journalEntries.put(entries.getId(), entries);
        }

        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
        return journalEntries.get(myId);

    }


    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryByd(@PathVariable Long myId) {
        return journalEntries.remove(myId);

    }



    @PutMapping("/id/{id}")
    public boolean updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
        journalEntries.put(id,myEntry);

//        for(JournalEntry entries : myEntry) {
//            journalEntries.put(entries.getId(), entries);
//        }
        return true;
    }
}
