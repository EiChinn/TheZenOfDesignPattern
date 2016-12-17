package com.eichinn.command_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class ZipUncompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return zip.uncompress(source, to);
    }
}
