package com.fyfeng.android.tools.compress;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * 对字节进行gzip压缩
 * @author yuzw
 *
 */
public class GZip {

	/**
     * 压缩
     * @param str
     * @param charset
     * @return
     */
    public static byte[] compress(byte[] bytes){
            
            GZIPOutputStream goutput = null;
            ByteArrayOutputStream boutput = new ByteArrayOutputStream();
            try {
                    
                    goutput = new GZIPOutputStream(boutput);
                    
                    goutput.write(bytes);
                    goutput.flush();
                    
            } catch (IOException e) {
                    e.printStackTrace();
            }finally{
                    if(null != goutput){ try {
                            goutput.close();
                    } catch (IOException e) {
                            e.printStackTrace();
                    }}
            }
            
            return boutput.toByteArray();
    }
    
    
    /**
     * 解压缩
     * @param bytes
     * @return
     */
    public static byte[] uncompress(byte[] bytes){
            
            GZIPInputStream ginput = null;
            ByteArrayOutputStream boutput = new ByteArrayOutputStream();
            try {
                    
                    ByteArrayInputStream binput = new ByteArrayInputStream(bytes);
                    
                    ginput = new GZIPInputStream(binput);
                    
                    byte[] b = new byte[1024];
                    int rl = 0;
                    while(true){
                            rl = ginput.read(b);
                            if(rl <= 0)break;
                            boutput.write(b, 0, rl);
                    }
                    boutput.flush();
                    
            } catch (IOException e) {
                    e.printStackTrace();
            }finally{
                    try {
                            ginput.close();
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
            }
            
            return boutput.toByteArray();
    }
}
