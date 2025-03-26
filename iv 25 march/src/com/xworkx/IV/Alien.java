package com.xworkx.IV;
import java.time.LocalDate;
public class Alien {



        private String seenBy;
        private LocalDate seenDate;
        private String describe;

        public Alien(String seenBy, LocalDate seenDate, String describe) {
            this.seenBy = seenBy;
            this.seenDate = seenDate;
            this.describe = describe;
        }


        public String getSeenBy() { return seenBy; }
        public LocalDate getSeenDate() { return seenDate; }
        public String getDescribe() { return describe; }


        public void setSeenBy(String seenBy) { this.seenBy = seenBy; }
        public void setSeenDate(LocalDate seenDate) { this.seenDate = seenDate; }
        public void setDescribe(String describe) { this.describe = describe; }
    }



