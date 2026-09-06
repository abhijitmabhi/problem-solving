package com.ama.remind;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge01 {
    public List<JobPosting> deduplicate(List<JobPosting> postings) {
        Map<Dedupkey, JobPosting> uniqueJobPostings = new HashMap<>();

        for (var posting : postings) {
            Dedupkey dedupkey = new Dedupkey(
                    posting.title(),
                    posting.company(),
                    posting.location()
            );

            var existing = uniqueJobPostings.get(dedupkey);

            if (existing == null || posting.postedTimestamp() > existing.postedTimestamp()) {
                uniqueJobPostings.put(dedupkey, posting);
            }

        }

        return uniqueJobPostings.values().stream().toList();
    }

    record Dedupkey(String title, String company, String location) {
    }
}

record JobPosting(
        String id,
        String title,
        String company,
        String location,
        long postedTimestamp
) {
}


