package com.example.crudsqlite;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"},
        d2 = {"Lcom/example/crudsqlite/ProductItemActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "deleteButton", "Landroid/widget/Button;", "getDeleteButton", "()Landroid/widget/Button;", "setDeleteButton", "(Landroid/widget/Button;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "CrudSqlite.app"}
)
public final class ProductItemActivity1 extends AppCompatActivity {
    public Button deleteButton;

    @NotNull
    public final Button getDeleteButton() {
        Button var10000 = this.deleteButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deleteButton");
        }

        return var10000;
    }

    public final void setDeleteButton(@NotNull Button var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.deleteButton = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300069);
        Log.w("ContentValues", "INgeniero quevin");
        View var10001 = this.findViewById(1000139);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.btn_product_item_delete)");
        this.deleteButton = (Button)var10001;
        Button var10000 = this.deleteButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deleteButton");
        }

        var10000.setOnClickListener((OnClickListener)null.INSTANCE);
    }
}
