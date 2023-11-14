import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> reportMap = new HashMap<String, Integer>();
        Map<String, String> reporterMap = new HashMap<String, String>();
        Map<String, Integer> mailMap = new LinkedHashMap<String, Integer>();
        
        for(int i = 0; i < id_list.length; i++){
            mailMap.put(id_list[i], 0);
        }
        
        for(int i = 0; i < report.length; i++){
            String reporter   = report[i].split(" ")[0];
            String respondent = report[i].split(" ")[1];
            
            if(!reportMap.containsKey(respondent)){
                reporterMap.put(respondent, reporter);
                reportMap.put(respondent, 1);
            } else {
                String report_lists = reporterMap.get(respondent);
                
                if(!report_lists.contains(" ") && !report_lists.equals(reporter)){
                    reporterMap.put(respondent, reporterMap.get(respondent) + " " + reporter);
                    reportMap.put(respondent, reportMap.get(respondent) + 1);
                } else if(report_lists.contains(" ")){
                    boolean flag = true;
                    for(String report_list : report_lists.split(" ")){
                        if(report_list.equals(reporter)){
                            flag = false;
                        }
                    }
                    
                    if(flag){
                        reporterMap.put(respondent, reporterMap.get(respondent) + " " +reporter);
                        reportMap.put(respondent, reportMap.get(respondent) + 1);
                    }
                }
            }
        }
        
        for(Map.Entry<String, Integer> entry : reportMap.entrySet()){
            String key = entry.getKey();
            int value  = entry.getValue();
            if(value >= k){
                String getMailUsers = reporterMap.get(key);
                if(getMailUsers.contains(" ")){
                    for(String getMailUser : getMailUsers.split(" ")){
                        mailMap.put(getMailUser, mailMap.get(getMailUser) + 1);
                    }
                } else {
                    mailMap.put(getMailUsers, mailMap.get(getMailUsers) +1);
                }
            }
        }
        
        int[] answer = new int[mailMap.size()];
        int idx = 0;
        for(int value : mailMap.values()){
            answer[idx++] = value;
        }
        return answer;
    }
}