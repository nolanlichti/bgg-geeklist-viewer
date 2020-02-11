import {Tag} from "bbcode-to-react";
import React from "react";

class StrikethroughTag extends Tag {
    toReact() {
        // using this.getComponents() to get children components.
        return (
            <s>{this.getComponents()}</s>
        );
    }
}

export default StrikethroughTag;
