package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {

    @Autowired
    TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository=timeEntryRepository;
    }

    public ResponseEntity<TimeEntry> create(TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity<TimeEntry> read(long id) {
        return null;
    }
    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }
    public ResponseEntity<TimeEntry> update(long id, TimeEntry timeEntry)
    {
        return null;
    }
    public ResponseEntity<TimeEntry> delete(long id) {
        return null;
    }
}
