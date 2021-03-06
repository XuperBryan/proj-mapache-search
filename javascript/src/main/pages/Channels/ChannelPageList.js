import React from "react";
import {useAuth0} from "@auth0/auth0-react";
import useSWR from "swr";
import { useParams} from "react-router-dom";
import {fetchWithToken} from "main/utils/fetch";
import MessageListView from "main/components/ChannelMessages/MessageListView"

const ChannelPageList = () => {
    const { getAccessTokenSilently: getToken } = useAuth0();
    const { channel } = useParams();
    const { data: messages } = useSWR([`/api/members/channel/${channel}/messages`, getToken], fetchWithToken);

    return (
        <>
            <h1> {channel} </h1>
            <a href={"/member/channels/" + channel}>Switch to Scrollable View</a>
            <MessageListView messages={messages || []} />
        </>
    );
};

export default ChannelPageList;
