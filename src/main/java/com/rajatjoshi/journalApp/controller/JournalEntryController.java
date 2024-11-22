package com.rajatjoshi.journalApp.controller;

import com.rajatjoshi.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntry>journalEntries=new HashMap<>();

    @GetMapping("/abc")//points
    public List<JournalEntry>getAll()
    {
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntries(@RequestBody List<JournalEntry> entries) {
        //multiple entries
        for(JournalEntry it:entries)
        {
            journalEntries.put(it.getId(),it);
        }
        return true;
    }
    //Specific ID get
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId)
    {
        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry DeleteJournalEntryById(@PathVariable Long myId)
    {
        return journalEntries.remove(myId);
    }

    @PutMapping("/id/{id}")
    public JournalEntry UpdateJournalEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry)
    {
        return journalEntries.put(id,myEntry);
    }
}
