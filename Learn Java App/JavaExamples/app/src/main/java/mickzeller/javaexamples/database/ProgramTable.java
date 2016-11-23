package mickzeller.javaexamples.database;

/**
 * Created by Mick Zeller on 11/22/2016.
 */

public class ProgramTable {

    public static final String TABLE_PROGRAMS = "programs";
    public static final String COLUMN_ID = "programId";
    public static final String COLUMN_NAME = "programName";
    public static final String COLUMN_DESCRIPTION = "programDescription";
    public static final String COLUMN_CODE = "code";

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_PROGRAMS + "(" + COLUMN_ID + " TEXT PRIMARY KEY," + COLUMN_NAME + " TEXT," + COLUMN_DESCRIPTION + " TEXT," + COLUMN_CODE + " TEXT" + ");";

}
