public abstract class abstractClass7 {

    //מחלקה אבסטרקטית הופכת להיות באותו רגע איזשהו שלד
    //כלומר ברגע שהוספת את המילה abstract המחלקה עצמה הופכת להיות השלד אך לה בפני עצמה אין משמעות
    //כלומר ממחלקה אבסטרקטית לא ניתן ליצור מופעים כמו למשל שהגדרנו את מחלקת Drone בתקייה מס 1
    //כאבסטרקטית ובטסטר של אותה תקייה ניסינו לבנות מופע רחפן חדש אך הציג שגיאה

//ניתן לראות שלאחר שנגדיר מחלקה אבסטרקטית באינטליגיי יהיו לה שני קווים אפורים בסמל המחלקה שבתפריט הצד

    /*הכללים החשובים במחלקה אבסטרקטית הפ :
     #שלא ניתן ליצור ממחלקה אבסטרקטית מופעים !!!
     אי אפשר לעשות לדוגמא Drone drone =new Dron... כי מחלקת דרון אבסטרקטית

      #ניתן להצהיר על מתודות מבלי לממש אותם כלומר לא חייב לרשום במתודה כלום
       במחלקת האב אך יהיה חיוב לממש במחלקת הבן (ראה שיטה אבסטרקטית useSDK במחלקת Drone)
       שים לב ! ברגע שהצהרתי על מתודה אחת כאבסטרקטית כל המחלקה הופכת להיות אבסטרקטי

       */
}
