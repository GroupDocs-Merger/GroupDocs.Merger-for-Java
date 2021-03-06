package com.groupdocs.merger.examples.basic_usage.single_document_operations.split_document;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.SplitMode;
import com.groupdocs.merger.domain.options.SplitOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to split the document to several multi-page documents by specified page ranges.
 */
public class SplitToMultiPageDocuments {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX_10_PAGES;
        String filePathOut = new File(Constants.OutputPath, "SplitToMultiPageDocuments-"+ Paths.get(filePath).getFileName().toString()).getPath();

        SplitOptions splitOptions = new SplitOptions(filePathOut,   new int[] { 3, 6, 8 }, SplitMode.Interval);

        Merger merger = new Merger(filePath);
        merger.split(splitOptions);


        System.out.print("Source document was splitted successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}