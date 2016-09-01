package com.jiangtour.model.net;

/**
 * @author husky
 */
public class StatusCode {
    public static final int success = 2000;
    public static final int non_initial = 2001;
    public static final int non_register = 3000;
    public static final int fail_register = 3001;
    public static final int account_already_register = 3002;
    public static final int wrong_password = 3003;
    public static final int invalid_request = 4000;
    public static final int non_Authorization = 4001;
    public static final int wrong_params = 4002;
    public static final int error_server = 4003;
    public static final int wrong_phone = 4004;
    public static final int fail_get_v_code = 4005;
    public static final int get_v_code_over_limit = 4006;
    public static final int wrong_v_code = 4007;
    public static final int phone_already_register = 4008;
    public static final int account_not_exist = 4009;
    public static final int account_frozen = 4010;
    public static final int account_bound_other_phone = 4011;
    public static final int non_bind_phone = 4012;
    public static final int invalid_phone = 4013;
    public static final int wrong_time_format = 4014;
    public static final int invalid_coordinates = 4015;
    public static final int server_inner_error = 5000;
    public static final int server_stopped = 5001;
    public static final int server_in_maintenance = 5002;
    public static final int service_not_support = 5003;
    public static final int invalid_identifier = 6000;
    public static final int non_identifier_photo = 6001;
    public static final int identifier_in_audit = 6002;
    public static final int identifier_audit_finish = 6003;
    public static final int identifier_audit_unfinish = 6004;
    public static final int data_not_exist = 7000;
    public static final int data_incomplete = 7001;
    public static final int error_data_update = 7002;
    public static final int error_data_query = 7003;
    public static final int wrong_data_format = 7004;
    public static final int pay_channel_not_support = 8000;
    public static final int wrong_amount = 8001;
    public static final int order_can_not_pay = 8002;
    public static final int order_already_payed = 8003;
    public static final int fail_create_order = 9000;
    public static final int order_not_belong = 9001;
    public static final int wrong_order_id = 9002;
    public static final int order_already_comment = 9003;
    public static final int order_not_exist = 9004;
    public static final int order_not_completed = 9005;
    public static final int fail_comment_order = 9006;
    public static final int has_unpayed_order = 9007;
    public static final int fail_cancel_order = 9008;
    public static final int content_not_exist = 10000;
    public static final int already_collected = 10001;
    public static final int already_liked = 10002;
    public static final int empty_comment_content = 11000;
    public static final int fail_comment = 11001;
    public static final int non_follow = 12000;
    public static final int already_follow = 12001;
    public static final int fail_follow = 12002;
    public static final int fail_add_black = 12003;
    public static final int already_add_black = 12004;
    public static final int fail_delete_fans = 12005;
    public static final int fans_already_deleted = 12006;
    public static final int not_friend = 12007;
    public static final int fail_delete_friend = 12008;
    public static final int friend_already_added = 12009;
    public static final int error_wallet = 13000;
    public static final int withdrawal_over_amount = 13001;
    public static final int already_been_agent = 14000;
    public static final int agent_not_exist = 14001;
    public static final int agent_frozen = 14002;
    public static final int agent_invalid = 14003;
    public static final int not_agent_invalid = 14004;
    public static final int can_not_add_agent = 14005;

    public static final String msg_success = "请求成功";
    public static final String msg_non_initial = "客户端尚未初始化，请先完成初始化";
    public static final String msg_non_register = "账号未注册，请先注册账号";
    public static final String msg_fail_register = "账号注册失败";
    public static final String msg_account_already_register = "账号已注册，请勿重复注册";
    public static final String msg_wrong_password = "密码错误";
    public static final String msg_invalid_request = "请求无效";
    public static final String msg_non_Authorization = "未授权，授权码失效或未登录";
    public static final String msg_wrong_params = "请求参数错误";
    public static final String msg_error_server = "服务器发生错误";
    public static final String msg_wrong_phone = "手机号码错误";
    public static final String msg_fail_get_v_code = "获取验证码失败";
    public static final String msg_get_v_code_over_limit = "获取验证码超过限额";
    public static final String msg_wrong_v_code = "验证码错误";
    public static final String msg_phone_already_register = "手机号已注册";
    public static final String msg_account_not_exist = "账号不存在";
    public static final String msg_account_frozen = "账号被冻结";
    public static final String msg_account_bound_other_phone = "账号已绑定其他手机号";
    public static final String msg_non_bind_phone = "未绑定手机号码";
    public static final String msg_invalid_phone = "无效的电话号码";
    public static final String msg_wrong_time_format = "时间格式错误";
    public static final String msg_invalid_coordinates = "无效的坐标";
    public static final String msg_server_inner_error = "服务器内部错误";
    public static final String msg_server_stopped = "服务器服务暂停";
    public static final String msg_server_in_maintenance = "服务器服务维护";
    public static final String msg_service_not_support = "服务器服务暂不支持";
    public static final String msg_invalid_identifier = "身份证号码无效";
    public static final String msg_non_identifier_photo = "身份证照片不存在";
    public static final String msg_identifier_in_audit = "身份信息正在审核中";
    public static final String msg_identifier_audit_finish = "身份已完成认证，请勿重复申请";
    public static final String msg_identifier_audit_unfinish = "身份认证未完成，请先完成认证";
    public static final String msg_data_not_exist = "数据不存在";
    public static final String msg_data_incomplete = "数据不完整";
    public static final String msg_error_data_update = "更新数据出错";
    public static final String msg_error_data_query = "查询数据错误";
    public static final String msg_wrong_data_format = "数据格式错误";
    public static final String msg_pay_channel_not_support = "支付渠道暂未开通";
    public static final String msg_wrong_amount = "金额错误";
    public static final String msg_order_can_not_pay = "订单不能创建支付";
    public static final String msg_order_already_payed = "订单已支付";
    public static final String msg_fail_create_order = "创建订单失败";
    public static final String msg_order_not_belong = "订单不是自己的";
    public static final String msg_wrong_order_id = "订单编号错误";
    public static final String msg_order_already_comment = "订单已评价";
    public static final String msg_order_not_exist = "订单不存在";
    public static final String msg_order_not_completed = "订单未完成";
    public static final String msg_fail_comment_order = "订单评价失败";
    public static final String msg_has_unpayed_order = "有未支付订单，请先完成支付";
    public static final String msg_fail_cancel_order = "订单取消失败";
    public static final String msg_content_not_exist = "内容不存在";
    public static final String msg_already_collected = "内容已收藏，请勿重复收藏";
    public static final String msg_already_liked = "内容已点赞，请勿重复点赞";
    public static final String msg_empty_comment_content = "评论内容不能为空";
    public static final String msg_fail_comment = "评价失败";
    public static final String msg_non_follow = "你还未关注对方，请先关注";
    public static final String msg_already_follow = "你已关注对方，请勿重复关注";
    public static final String msg_fail_follow = "关注用户未成功";
    public static final String msg_fail_add_black = "拉黑用户失败";
    public static final String msg_already_add_black = "用户已被拉黑，请勿重复拉黑";
    public static final String msg_fail_delete_fans = "移除粉丝失败";
    public static final String msg_fans_already_deleted = "对方已不是你的粉丝，请勿重复移除";
    public static final String msg_not_friend = "对方还不是好友，请先添加为好友";
    public static final String msg_fail_delete_friend = "删除好友失败";
    public static final String msg_friend_already_added = "对方已经是好友，请勿重复添加";
    public static final String msg_error_wallet = "钱包出错";
    public static final String msg_withdrawal_over_amount = "提现金额超出钱包可提金额";
    public static final String msg_already_been_agent = "此账号已是代理账号";
    public static final String msg_agent_not_exist = "代理账号不存在";
    public static final String msg_agent_frozen = "代理账号被冻结";
    public static final String msg_agent_invalid = "代理账号功能失效";
    public static final String msg_not_agent_invalid = "此账号不是代理或代理失效";
    public static final String msg_can_not_add_agent = "此账号不能添加下级代理";

    private static final int[] codes = new int[]{
            success,
            non_initial,
            non_register,
            fail_register,
            account_already_register,
            wrong_password,
            invalid_request,
            non_Authorization,
            wrong_params,
            error_server,
            wrong_phone,
            fail_get_v_code,
            get_v_code_over_limit,
            wrong_v_code,
            phone_already_register,
            account_not_exist,
            account_frozen,
            account_bound_other_phone,
            non_bind_phone,
            invalid_phone,
            wrong_time_format,
            invalid_coordinates,
            server_inner_error,
            server_stopped,
            server_in_maintenance,
            service_not_support,
            invalid_identifier,
            non_identifier_photo,
            identifier_in_audit,
            identifier_audit_finish,
            identifier_audit_unfinish,
            data_not_exist,
            data_incomplete,
            error_data_update,
            error_data_query,
            wrong_data_format,
            pay_channel_not_support,
            wrong_amount,
            order_can_not_pay,
            order_already_payed,
            fail_create_order,
            order_not_belong,
            wrong_order_id,
            order_already_comment,
            order_not_exist,
            order_not_completed,
            fail_comment_order,
            has_unpayed_order,
            fail_cancel_order,
            content_not_exist,
            already_collected,
            already_liked,
            empty_comment_content,
            fail_comment,
            non_follow,
            already_follow,
            fail_follow,
            fail_add_black,
            already_add_black,
            fail_delete_fans,
            fans_already_deleted,
            not_friend,
            fail_delete_friend,
            friend_already_added,
            error_wallet,
            withdrawal_over_amount,
            already_been_agent,
            agent_not_exist,
            agent_frozen,
            agent_invalid,
            not_agent_invalid,
            can_not_add_agent
    };

    private static final String[] msgs = new String[]{
            msg_success,
            msg_non_initial,
            msg_non_register,
            msg_fail_register,
            msg_account_already_register,
            msg_wrong_password,
            msg_invalid_request,
            msg_non_Authorization,
            msg_wrong_params,
            msg_error_server,
            msg_wrong_phone,
            msg_fail_get_v_code,
            msg_get_v_code_over_limit,
            msg_wrong_v_code,
            msg_phone_already_register,
            msg_account_not_exist,
            msg_account_frozen,
            msg_account_bound_other_phone,
            msg_non_bind_phone,
            msg_invalid_phone,
            msg_wrong_time_format,
            msg_invalid_coordinates,
            msg_server_inner_error,
            msg_server_stopped,
            msg_server_in_maintenance,
            msg_service_not_support,
            msg_invalid_identifier,
            msg_non_identifier_photo,
            msg_identifier_in_audit,
            msg_identifier_audit_finish,
            msg_identifier_audit_unfinish,
            msg_data_not_exist,
            msg_data_incomplete,
            msg_error_data_update,
            msg_error_data_query,
            msg_wrong_data_format,
            msg_pay_channel_not_support,
            msg_wrong_amount,
            msg_order_can_not_pay,
            msg_order_already_payed,
            msg_fail_create_order,
            msg_order_not_belong,
            msg_wrong_order_id,
            msg_order_already_comment,
            msg_order_not_exist,
            msg_order_not_completed,
            msg_fail_comment_order,
            msg_has_unpayed_order,
            msg_fail_cancel_order,
            msg_content_not_exist,
            msg_already_collected,
            msg_already_liked,
            msg_empty_comment_content,
            msg_fail_comment,
            msg_non_follow,
            msg_already_follow,
            msg_fail_follow,
            msg_fail_add_black,
            msg_already_add_black,
            msg_fail_delete_fans,
            msg_fans_already_deleted,
            msg_not_friend,
            msg_fail_delete_friend,
            msg_friend_already_added,
            msg_error_wallet,
            msg_withdrawal_over_amount,
            msg_already_been_agent,
            msg_agent_not_exist,
            msg_agent_frozen,
            msg_agent_invalid,
            msg_not_agent_invalid,
            msg_can_not_add_agent,
    };


    public static boolean config(int code) {
        return code == success;
    }

    public String match(int code) {
        for (int i = 0 ; i < codes.length ; i++){
            int nCode = codes[i];
            if (nCode == code){
                return msgs[i];
            }
        }
        return "";
    }

}
