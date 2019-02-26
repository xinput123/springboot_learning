package xx.controller;

import com.itextpdf.text.DocumentException;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;


/**
 * @author xinput
 * @date 2018-12-13 11:47
 */
@RestController
public class PdfController {

    @RequestMapping(value = "/{fileName}", method = RequestMethod.GET)
    public void showPdf(HttpServletResponse response, @PathVariable("fileName") String fileName) throws IOException, DocumentException {
        // 读取pdf并预览
        readPdf(response, fileName);
    }

    /**
     * 读取本地pdf,这里设置的是预览
     */
    private void readPdf(HttpServletResponse response, String fileName) {
        response.reset();
        response.setContentType("application/pdf");
        try {
            String path = "pdf/" + fileName + ".pdf";
            String targetPath = this.getClass().getClassLoader().getResource(path).getPath();
            FileInputStream fileInputStream = new FileInputStream(targetPath);
            OutputStream outputStream = response.getOutputStream();
            IOUtils.write(IOUtils.toByteArray(fileInputStream), outputStream);
            response.setHeader("Content-Disposition", "inline; filename= file");
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
