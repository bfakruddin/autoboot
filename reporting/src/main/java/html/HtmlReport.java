package html;

import common.Reporter;
import common.Result;
import j2html.TagCreator;
import j2html.tags.ContainerTag;
import j2html.tags.Tag;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;

import static j2html.TagCreator.*;
import static j2html.TagCreator.h1;

public class HtmlReport implements Reporter {

    public HtmlReport() throws IOException {
        String path = System.getProperty("user.dir");
        // HTML file path must be under /src/main/reports
        Timestamp timestamp =  Timestamp.from(Instant.now());
        String timeStampString = timestamp.toString().replace(" ", "_").replace(":", "_").replace(".", "_");
        System.out.println(timeStampString);

        /*File file = new File(path+"/src/main/reports/htmlreports_"+timeStampString+".html");
        file.createNewFile();
        if(file.exists()){
            new Throwable("file exists");
        }*/

        File file1 = new File("/Users/babafakruddindudekula/sample.txt");

// /Users/babafakruddindudekula/Documents/Technical-Practicing/Automation/autoboot/src/main/reports/htmlreports_2019-09-03_22_54_59_063.html
    }

    @Override
    public void reportEvent(Result result) {

    }

    public static void main(String[] args) throws IOException {
//        HtmlReport htmlReport = new HtmlReport();

        ContainerTag newTag = table().with(thead().with(td("Sl.No"), td("Name"), td("Age")));
        ContainerTag missTag = div("Missed Tag");
        ContainerTag changedTag = button("Its Ok");

        String op = renderer(newTag, missTag, changedTag);
        System.out.println(op);

        String path = System.getProperty("user.dir");
        Timestamp timestamp =  Timestamp.from(Instant.now());
        String timeStampString = timestamp.toString().replace(" ", "_").replace(":", "_").replace(".", "_");

        File file = new File(path+"/src/main/reports/htmlreports_"+timeStampString+".html");
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(op.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();

    }

    private static String renderer(ContainerTag ol_new, ContainerTag ol_miss, ContainerTag ol_changed){
        ContainerTag html = html().attr("lang", "en").with(
                head().with(
                        meta().withCharset("utf-8"),
                        title("Html report")
//                        ,link().withRel("stylesheet").withHref(linkCss)
                ),
                body().with(
                        header().with(h1("Automation Report")),
                        div().withClass("article").with(
                                div().with(h2("What's New"),hr(),ol_new),
                                div().with(h2("What's Deprecated"),hr(),ol_miss),
                                div().with(h2("What's Changed"),hr(),ol_changed)
                        ),
                        ol_new
                )
        );

        return document().render() + html.render();
    }

}
