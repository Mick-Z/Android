package mickzeller.javaexamples.model;

import java.util.UUID;

/**
 * Created by Mick Zeller on 11/21/2016.
 */

public class ProgramProvider
{
    private String programID;
    private String programName;
    private String programDescription;
    private String code;


    public ProgramProvider() {
    }

    public ProgramProvider(String programID, String programName, String programDescription, String code) {

        if (programID == null) {
            programID = UUID.randomUUID().toString();
        }

        this.programID = programID;
        this.programName = programName;
        this.programDescription = programDescription;
        this.code = code;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramDescription() {
        return programDescription;
    }

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
