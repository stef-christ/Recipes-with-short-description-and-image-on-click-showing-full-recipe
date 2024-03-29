package com.example.enotita_4_7;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "recipes_db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_RECIPES = "recipes";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_IMAGE_URL = "image";

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = " CREATE TABLE " + TABLE_RECIPES + " ( " +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_TITLE + " text not null, " +
                COLUMN_DESCRIPTION + " text not null, " +
                COLUMN_IMAGE_URL + " text not null)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put(COLUMN_TITLE, "Healthy κοτομπουκιές στον φούρνο");
        values.put(COLUMN_DESCRIPTION, "Συστατικά\n" +
                "\nΓια τη μαρινάδα\n" +
                "\n650 γρ. φιλέτο στήθος κοτόπουλο\n" +
                "αλάτι\n" +
                "πιπέρι\n" +
                "1 κ.σ. θυμάρι\n" +
                "2 σκ. σκόρδο\n" +
                "250 γρ. ξινόγαλο\n" +
                "Για το πανάρισμα\n" +
                "200 γρ. πάνκο ή φρυγανιά τριμμένη\n" +
                "1 κ.γ. κάρι\n" +
                "1 κ.γ. πάπρικα\n" +
                "1 κ.γ. σκόρδο σε σκόνη\n" +
                "1 κ.σ. θυμάρι ξηρό\n" +
                "αλάτι\n" +
                "πιπέρι\n" +
                "2 κ.σ. ελαιόλαδο\n" +
                "\nΓια τη σάλτσα\n" +
                "\n150 γρ. γιαούρτι στραγγιστό\n" +
                "1 κ.γ. κάρι\n" +
                "1 κ.γ. μουστάρδα\n" +
                "1 κ.γ. μέλι\n" +
                "\nΓια το σερβίρισμα\n" +
                "\nφέτες από λάιμ\n" +
                "ρίγανη\n" +
                "θυμάρι\n" +
                "βασιλικό\n" +
                "\nΜέθοδος Εκτέλεσης\n" +
                "\nΓια τη μαρινάδα\n" +
                "\nΚόβουμε το κοτόπουλο σε λεπτές λωρίδες με πάχος 1-2 εκ.\n" +
                "Βάζουμε τις λωρίδες σε ένα μπολ και προσθέτουμε αλάτι, πιπέρι και ανακατεύουμε.\n" +
                "Προσθέτουμε θυμάρι, τα σκόρδα κομμένα σε κομμάτια, το ξινόγαλο και ανακατεύουμε.\n" +
                "Καλύπτουμε με μεμβράνη και βάζουμε στο ψυγείο για 6-12 ώρες.\n" +
                "\nΓια τη μαρινάδα\n" +
                "\nΠροθερμαίνουμε τον φούρνο στους 220ο C στον αέρα.\n" +
                "Σε ένα μπολ βάζουμε το πάνκο, το κάρι, την παάπρικα, το σκόρδο, το θυμάρι και ανακατεύουμε.\n" +
                "Βάζουμε το μαριναρισμένο κοτόπουλο στο μπολ με τη μαρινάδα και ανακατεύουμε ώστε να καλυφθεί όλη η επιφάνεια από τις λωρίδες του κοτόπουλου.\n" +
                "Απλώνουμε το κοτόπουλο σε ταψιά με λαδόκολλα, βάζουμε αλάτι, πιπέρι, το ελαιόλαδο και ψήνουμε για 8-10 λεπτά.\n" +
                "\nΓια τη σάλτσα\n" +
                "\nΣε ένα μπολ βάζουμε το γιαούρτι, το κάρι, τη μουστάρδα, το μέλι και ανακατεύουμε καλά να ομογενοποιηθούν τα υλικά.\n" +
                "Σερβίρουμε τις κοτομπουκιές με φέτες λάιμ, ρίγανη, θυμάρι και βασιλικό.");
        values.put(COLUMN_IMAGE_URL, "https://akispetretzikis.com/system/uploads/medium/data/14615/recipe_main_kotompoukies-ston-fourno.jpg");
        db.insert(TABLE_RECIPES, null, values);

        values = new ContentValues();
        values.put(COLUMN_TITLE, "Τηγανητό ρύζι από κουνουπίδι");
        values.put(COLUMN_DESCRIPTION, "Συστατικά\n" +
                "\n1 κουνουπίδι\n" +
                "3 καρότα\n" +
                "1 πιπεριά κόκκινη\n" +
                "2 σκ. σκόρδο\n" +
                "3 φρέσκα κρεμμυδάκια\n" +
                "3 κ.σ. ελαιόλαδο\n" +
                "200 γρ. αρακά\n" +
                "150-200 γρ. σάλτσα σόγιας\n" +
                "10 γαρίδες No 0\n" +
                "1 κ.σ. σησαμέλαιο\n" +
                "πιπέρι\n" +
                "αλάτι, προαιρετικά\n" +
                "\nΓια το σερβίρισμα\n" +
                "\n" +
                "2 κ.σ. μαϊντανό, ψιλοκομμένο\n" +
                "\nΜέθοδος Εκτέλεσης\n" +
                "\nΚόβουμε το κουνουπίδι σε μπουκετάκια και το περνάμε από το πολυμηχάνημα με τα μαχαίρια λίγο λίγο μέχρι να τριφτεί και να μοιάζει με κόκκους ρυζιού.\n" +
                "Κόβουμε τα καρότα στα 4 κατά μήκος και στη συνέχεια τα κόβουμε σε μικρές φετούλες 0,5 εκ.\n" +
                "Κόβουμε την πιπεριά σε κυβάκια 0,5 εκ.\n" +
                "Ψιλοκόβουμε τα σκόρδα και τα φρέσκα κρεμμυδάκια.\n" +
                "Ζεσταίνουμε το ελαιόλαδο σε ένα γουόκ ή σε ένα τηγάνι σε μέτρια φωτιά.\n" +
                "Ρίχνουμε πρώτα την πιπεριά, τα καρότα και τα σοτάρουμε για 2-3 λεπτά μέχρι να μαλακώσουν.\n" +
                "Στη συνέχεια προσθέτουμε το σκόρδο και τα φρέσκα κρεμμυδάκια. Σοτάρουμε για άλλο 1 λεπτό.\n" +
                "Προσθέτουμε το κουνουπίδι, τον αρακά και σοτάρουμε για 2-3 λεπτά με τα υπόλοιπα υλικά ανακατεύοντας με μία ξύλινη κουτάλα.\n" +
                "Σβήνουμε με τη σάλτσα σόγιας και μαγειρεύουμε για 2-3 λεπτά ακόμα.\n" +
                "Καθαρίζουμε τις γαρίδες τα κελύφη και το έντερο κρατώντας το κεφάλι και την ουρά.\n" +
                "Ρίχνουμε τις γαρίδες στο γουόκ και καπακώνουμε.\n" +
                "Αφήνουμε για 4-5 λεπτά μέχρι να ψηθούν οι γαρίδες από τους ατμούς.\n" +
                "Προσθέτουμε το σησαμέλαιο, το πιπέρι και λίγο αλάτι αν χρειαστεί.\n" +
                "Σερβίρουμε με τον ψιλοκομμένο μαϊντανό.\n");
        values.put(COLUMN_IMAGE_URL, "https://akispetretzikis.com/system/uploads/medium/data/12979/recipe_main_garides_me_cauliflower_rice_15-11-17-site.jpg");
        db.insert(TABLE_RECIPES, null, values);

        values = new ContentValues();
        values.put(COLUMN_TITLE, "Gazpacho με κολοκυθάκια");
        values.put(COLUMN_DESCRIPTION, "Συστατικά\n" +
                "\n3 κ.σ. ελαιόλαδο\n" +
                "3 πράσα, το λευκό κομμάτι\n" +
                "1 σκ. σκόρδο\n" +
                "4 κολοκυθάκια, κομμένα σε κομμάτια 2 εκ.\n" +
                "50 γρ. σπόρους κάνναβης + έξτρα, για το σερβίρισμα\n" +
                "χυμός από 2 λεμόνια\n" +
                "700 γρ. νερό\n" +
                "10 φύλλα βασιλικού + έξτρα, για το σερβίρισμα\n" +
                "αλάτι\n" +
                "πιπέρι\n" +
                "¼ κ.γ. μπούκοβο, για το σερβίρισμα\n" +
                "\nΜέθοδος Εκτέλεσης\n" +
                "\nΖεσταίνουμε το ελαιόλαδο σε ένα τηγάνι σε μέτρια φωτιά.\n" +
                "Κόβουμε το λευκό κομμάτι από τα πράσα σε λεπτές ροδέλες και σοτάρουμε για 5-6 λεπτά μέχρι να μαλακώσουν αλλά να μην έχουν πάρει πολύ έντονο χρώμα.\n" +
                "Αποσύρουμε το τηγάνι από τη φωτιά, μεταφέρουμε τα πράσα σε ένα μπολ, και αφήνουμε να κρυώσουν για 20 λεπτά.\n" +
                "Μεταφέρουμε σε ένα μπλέντερ τα πράσα μαζί με το σκόρδο, τα κολοκυθάκια, τους σπόρους κάνναβης, τον χυμό λεμονιού, το νερό, τα φύλλα βασιλικού, το αλάτι και το πιπέρι.\n" +
                "Χτυπάμε για 1-2 λεπτά μέχρι να έχουμε ένα ομοιόμορφο και λείο μείγμα.\n" +
                "Σερβίρουμε με τους σπόρους κάνναβης, το μπούκοβο και τα φύλλα βασιλικού.");
        values.put(COLUMN_IMAGE_URL, "https://akispetretzikis.com/system/uploads/medium/data/14557/recipe_main_gazpacho_kolokithi-12-6-19-site.jpg");
        db.insert(TABLE_RECIPES, null, values);

        values = new ContentValues();
        values.put(COLUMN_TITLE, "Ορτύκια κρασάτα με μυρωδικά");
        values.put(COLUMN_DESCRIPTION, "Συστατικά\n" +
                "\n6 ορτύκια\n" +
                "40 γρ. ελαιόλαδο\n" +
                "1 κρεμμύδι, ψιλοκομμένο\n" +
                "1 σκ. σκόρδο, ψιλοκομμένο\n" +
                "2 κ.σ. φρέσκο θυμάρι\n" +
                "αλάτι\n" +
                "πιπέρι\n" +
                "1 κ.σ. πελτέ ντομάτας\n" +
                "100 γρ. κόκκινο κρασί\n" +
                "400 γρ. ντομάτα κονκασέ\n" +
                "πουρέ πατάτας, για το σερβίρισμα\n" +
                "φρέσκο θυμάρι, για το σερβίρισμα\n" +
                "\nΜέθοδος Εκτέλεσης\n" +
                "\nΚόβουμε τα ορτύκια με ψαλίδι κουζίνας, κατά μήκος της σπονδυλικής στήλης. Αφαιρούμε τη σπονδυλική στήλη.\n" +
                "Μεταφέρουμε σε ένα μπολ τα ορτύκια.\n" +
                "Προσθέτουμε στο μπολ το μισό ελαιόλαδο, το ψιλοκομμένο κρεμμύδι, το ψιλοκομμένο σκόρδο, το θυμάρι, το αλάτι και το πιπέρι.\n" +
                "Ζεσταίνουμε το υπόλοιπο ελαιόλαδο σε μια κατσαρόλα σε μέτρια φωτιά και σοτάρουμε τα ορτύκια μαζί με τα υπόλοιπα υλικά του μπολ για 1-2 λεπτά από κάθε πλευρά μέχρι να ροδίσουν.\n" +
                "Προσθέτουμε τον πελτέ ντομάτας και ανακατεύουμε για 1 λεπτό.\n" +
                "Σβήνουμε με το κρασί και αφήνουμε να εξατμιστεί η μισή ποσότητα.\n" +
                "Προσθέτουμε την ντομάτα κονκασέ και καπακώνουμε.\n" +
                "Σιγοβράζουμε για 15 λεπτά.\n" +
                "Αποσύρουμε την κατσαρόλα από τη φωτιά και σερβίρουμε με πουρέ πατάτας και λίγο φρέσκο θυμάρι.");
        values.put(COLUMN_IMAGE_URL, "https://akispetretzikis.com/system/uploads/medium/data/14464/recipe_main_ortikia_krasata-site.jpg");
        db.insert(TABLE_RECIPES, null, values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
