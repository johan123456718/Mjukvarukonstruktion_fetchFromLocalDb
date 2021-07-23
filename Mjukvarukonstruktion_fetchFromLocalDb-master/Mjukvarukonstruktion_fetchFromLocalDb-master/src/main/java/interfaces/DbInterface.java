package interfaces;

import model.JournalRecord;

import java.util.List;

public interface DbInterface {

    public void saveToDB(JournalRecord record);
    public JournalRecord getJournalRecordById(int id);
    public List<JournalRecord> getAllJournalRecords();
}

