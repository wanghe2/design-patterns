package com.wang.word;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 统计词频
 * @author wanghe
 *
 */
public class WordStat {

    public static Map<String,Integer> statFrequency(List<String>strList) {
    	Set<String>setList=new HashSet<>(strList);
    	Map<String,Integer>wordMaps=new TreeMap<String, Integer>();
    	for(String set:setList) {
    		Integer frequency=0;
    		for(String str:strList) {
    			if(set.equals(str)) {
    				frequency++;
    			}
    		}
    		wordMaps.put(set, frequency);
    	}
    	
    	return wordMaps;
    }

}
