<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/clouddebugger/v2/data.proto

namespace Google\Devtools\Clouddebugger\V2;

/**
 * Enumerates references to which the message applies.
 *
 * Protobuf enum <code>Google\Devtools\Clouddebugger\V2\StatusMessage\Reference</code>
 */
class StatusMessage_Reference
{
    /**
     * Status doesn't refer to any particular input.
     *
     * Generated from protobuf enum <code>UNSPECIFIED = 0;</code>
     */
    const UNSPECIFIED = 0;
    /**
     * Status applies to the breakpoint and is related to its location.
     *
     * Generated from protobuf enum <code>BREAKPOINT_SOURCE_LOCATION = 3;</code>
     */
    const BREAKPOINT_SOURCE_LOCATION = 3;
    /**
     * Status applies to the breakpoint and is related to its condition.
     *
     * Generated from protobuf enum <code>BREAKPOINT_CONDITION = 4;</code>
     */
    const BREAKPOINT_CONDITION = 4;
    /**
     * Status applies to the breakpoint and is related to its expressions.
     *
     * Generated from protobuf enum <code>BREAKPOINT_EXPRESSION = 7;</code>
     */
    const BREAKPOINT_EXPRESSION = 7;
    /**
     * Status applies to the breakpoint and is related to its age.
     *
     * Generated from protobuf enum <code>BREAKPOINT_AGE = 8;</code>
     */
    const BREAKPOINT_AGE = 8;
    /**
     * Status applies to the entire variable.
     *
     * Generated from protobuf enum <code>VARIABLE_NAME = 5;</code>
     */
    const VARIABLE_NAME = 5;
    /**
     * Status applies to variable value (variable name is valid).
     *
     * Generated from protobuf enum <code>VARIABLE_VALUE = 6;</code>
     */
    const VARIABLE_VALUE = 6;
}
