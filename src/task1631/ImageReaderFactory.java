package task1631;

import com.javarush.task.task16.task1631.common.*;


public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes png) {
        ImageReader reader = null;
        if (png == null) {
           throw  new IllegalArgumentException("incorrect format");
        }

        switch (png) {
            case JPG:
                reader = new JpgReader();
                break;
            case BMP:
                reader = new BmpReader();
                break;
            case PNG:
                reader = new PngReader();
                break;
            default:


        }
        return reader;

    }



}

