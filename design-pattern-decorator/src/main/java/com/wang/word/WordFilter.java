package com.wang.word;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

/**
 * java分词工具
 * @author wanghe
 *
 */
public class WordFilter {

	 public static List<String> getStrList(String text) throws Exception{
        //独立Lucene实现
        StringReader re = new StringReader(text);
        IKSegmenter ik = new IKSegmenter(re, true);
        Lexeme lex;
        List<String> s = new ArrayList<String>();
        while ((lex = ik.next()) != null) {
            s.add(lex.getLexemeText());
        }
        return s;
    }
}
