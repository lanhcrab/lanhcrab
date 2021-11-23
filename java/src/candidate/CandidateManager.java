package candidate;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class CandidateManager {

    private ArrayList<Candidate> candidates;

    public CandidateManager() {
        this.candidates = new ArrayList<>();
    }
    
    /*
    readData
    doc du lieu tu file van ban textFile va luu du lieu vao cac bien thanh vien
    */
//    public static int numbersLine(String path) {
//        try {
//            File file = new File(path);
//            if (file.exists()) {
//                FileReader fr = new FileReader(file);
//                LineNumberReader lnr = new LineNumberReader(fr);
//                int linenumber = 0;
//                while (lnr.readLine() != null) {
//                    linenumber++;
//                }
//                System.out.println("Total number of lines : " + linenumber);
//                lnr.close();
//            } else {
//                System.out.println("File does not exists!");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public boolean readData(String textFile) {
        try {
            File file = new File(textFile);
            Scanner sc = new Scanner(file);
            String id, name, selection, sex;
            int year, priority;

            while(sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] arrayStrings = str.split("\\|");
                id = arrayStrings[0].trim();
                name = arrayStrings[1].trim();
                selection = arrayStrings[2].trim();
                sex  = arrayStrings[3].trim();
                year = Integer.parseInt(arrayStrings[4].trim());
                priority = Integer.parseInt(arrayStrings[5].trim());
                Candidate candidate = new Candidate(id, name, selection, sex, year, priority);
                candidates.add(candidate);
            }
            return true;
        } catch(IOException ex) {
            System.out.println("Error reading file '" + textFile + "'");
            return false;
        }
    }
    /*
    getSelectionCandicates
    trả về danh sách các thí sinh có khối thi là selection
    */
    public ArrayList<Candidate> getSelectionCandicates(String selection) {
        ArrayList<Candidate> res = new ArrayList<>();
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getSelection().equals(selection)) {
                res.add(candidates.get(i));
            }
        }
        return res;
    }

    /*
    getPriorityCandidates
    trả về danh sách thí sinh được ưu tiên (có độ ưu tiên bằng 1)
    */
    public ArrayList<Candidate> getPriorityCandidates() {
        ArrayList<Candidate> res = new ArrayList<>();
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getPriority() == 1) {
                res.add(candidates.get(i));
            }
        }
        return res;
    }

    /*
    sortByName
    tra ve danh sach cac thi sinh duoc sap xep theo ho va ten (name)
    */
    public ArrayList<Candidate> sortByName() {
        ArrayList<Candidate> res = new ArrayList<>(candidates);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.size(); j++) {
                if (res.get(i).getName().compareTo(res.get(j).getName()) < 0) {
                    Candidate candidate = res.get(i);
                    res.set(i, res.get(j));
                    res.set(j, candidate);
                }
            }
        }

        return res;
    }

    /*
    getSecondYoungestCandidates
    trả về danh sách các thí sinh có tuổi trẻ thứ 2 trong danh sách
    (ví dụ: các khách hàng có các năm sinh 1990 1991 1992 1993,
    trả về danh sách các khách hàng sinh năm 1992)
    */
    public ArrayList<Candidate> getSecondYoungestCandidates() {
        ArrayList<Candidate> res = new ArrayList<>(candidates);
        ArrayList<Candidate> temp = findMax(res);
        res.removeAll(temp);
        res = findMax(res);
        return res;
    }

    private ArrayList<Candidate> findMax(ArrayList<Candidate> list) {
        ArrayList<Candidate> res = new ArrayList<>();
        int max = 0;
        for (Candidate value : list) {
            if (value.getYear() > max) {
                max = value.getYear();
            }
        }
        for (Candidate candidate : list) {
            if (candidate.getYear() == max) {
                res.add(candidate);
            }
        }
        return res;
    }

    /*
    printCandidatesFromArray
    in danh sach cac thi sinh tu mot List da cho
    */
    public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
        if (candidates == null) {
            return;
        }

        for (int i = 0; i < candidates.size(); i++) {
            candidates.get(i).print();
        }
    }

    /*
    printCandidates
    in danh cach cac thi sinh duoc luu trong bien thanh vien candidates
    */
    public void printCandidates() {
        printCandidatesFromArray(this.candidates);
    }

    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        if (!candidateManager.readData("candidates.txt")) {
            return;
        }

        //ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
        //candidateManager.printCandidatesFromArray(selectionCandidates);
        //System.out.println();

        //ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
        //candidateManager.printCandidatesFromArray(priorityCandidates);
        //System.out.println();

        //ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
        //candidateManager.printCandidatesFromArray(sortedNameCandidates);
        //System.out.println();

        //ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
        //candidateManager.printCandidatesFromArray(secondYoungestCandidates);
    }

}