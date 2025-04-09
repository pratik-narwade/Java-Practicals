import java.time.Year;

public class CMS {

    static int countECE = 0;
    static int countCHEM = 0;
    static int countIT = 0;
    static int countCSE = 0;
    static int countTXT = 0;
    static int countMECH = 0;
    static int countIN = 0;
    static int countPR = 0;

    String name;
    String email;
    String registrationNumber;
    String bGroup;
    String branch;
    String admissionMode;
    String category;
    String categoryOfAdmission;

    int admissionYear;
    int currentYear;

    CMS(String name, String branch, String bGroup, String admissionMode,
        String category, String categoryOfAdmission, int admissionYear) {
        setName(name);
        setBranch(branch);
        setBGroup(bGroup);
        setAdmissionMode(admissionMode);
        setCategory(category);
        setCategoryOfAdmission(categoryOfAdmission);
        setAdmissionYear(admissionYear);
        generateRegNumber();
        calculateCurrentYear();
    }

    void setName(String name) {
        this.name = name;
    }

    void setBGroup(String bGroup) {
        this.bGroup = bGroup;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }

    void setAdmissionMode(String admissionMode) {
        this.admissionMode = admissionMode;
    }

    void setCategory(String category) {
        this.category = category;
    }

    void setCategoryOfAdmission(String categoryOfAdmission) {
        this.categoryOfAdmission = categoryOfAdmission;
    }

    void setAdmissionYear(int year) {
        this.admissionYear = year;
    }

    void calculateCurrentYear() {
        this.currentYear = (Year.now().getValue() - this.admissionYear) + 1;
    }

    void generateEmail(String regNo) {
        String rep = regNo.substring(4, 8);
        String s = regNo.replace(rep, rep.toLowerCase());
        this.email = s + "@sggs.ac.in";
    }

    void generateRegNumber() {
        String branchCode = getBranchCode(branch);
        int serial = getSerialForBranch(branchCode);

        if (admissionMode.equalsIgnoreCase("DSY")) {
            serial += 500;
            this.registrationNumber = admissionYear + "B" + branchCode + serial;
        } else {
            this.registrationNumber = admissionYear + "B" + branchCode + String.format("%03d", serial);
        }

        generateEmail(this.registrationNumber);
    }

    int getSerialForBranch(String branchCode) {
        if (branchCode.equals("IT")) {
            return ++countIT;
        } else if (branchCode.equals("ME")) {
            return ++countMECH;
        } else if (branchCode.equals("EC")) {
            return ++countECE;
        } else if (branchCode.equals("TXT")) {
            return ++countTXT;
        } else if (branchCode.equals("IN")) {
            return ++countIN;
        } else if (branchCode.equals("PR")) {
            return ++countPR;
        } else if (branchCode.equals("CH")) {
            return ++countCHEM;
        } else {
            return ++countCSE;
        }
    }

    String getBranchCode(String branch) {
        branch = branch.toLowerCase();

        if (branch.contains("instrument")) {
            return "IN";
        } else if (branch.contains("prod")) {
            return "PR";
        } else if (branch.contains("chem")) {
            return "CH";
        } else if (branch.contains("text")) {
            return "TXT";
        } else if (branch.contains("mech")) {
            return "ME";
        } else if (branch.contains("ece")) {
            return "EC";
        } else if (branch.contains("it")) {
            return "IT";
        } else if (branch.contains("cse")) {
            return "CS";
        } else {
            return "CS";
        }
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
        "Registration Number: " + this.registrationNumber + "\n" +
        "Email: " + this.email + "\n" +
        "Branch: " + this.branch + "\n" +
        "Category: " + this.category + "\n" +
        "Category of Admission: " + this.categoryOfAdmission + "\n" +
        "Admission Mode: " + this.admissionMode+ "\n" +
        "Blood Group: " + this.bGroup+ "\n" +
        "Admission Year: " + this.admissionYear+ "\n" +
        "Current Year: " + this.currentYear + "\n" +
        ".".repeat(50);
    }

    public static void main(String[] args) {
        CMS s1 = new CMS("Pratik Narwade", "IT", "A+", "Regular", "Open", "CAP", 2023);
        CMS s2 = new CMS("Pratik Shinde", "CSE", "B+", "DSY", "Open", "Institutional", 2024);
        CMS s3 = new CMS("Rahul Ambhore", "IT", "A-", "Regular", "OBC", "CAP", 2025);
        CMS s4 = new CMS("Omkar Gawande", "IT", "O+", "Regular", "OBC", "CAP", 2022);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}

