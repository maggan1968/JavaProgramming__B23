package day41_CustomClass_Constructor.ScrumTask;

import java.util.ArrayList;

public class ScrumTeam {

    public String PO;
    public String BA;
    public String SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
       testers = new ArrayList<>();
       developers = new ArrayList<>();
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO= '" + PO + '\'' +
                ", BA= '" + BA + '\'' +
                ", SM= '" + SM + '\'' +
                ", number of testers= " + testers.size() +
                ", number of developers= " + developers.size() +
                '}';
    }



}
